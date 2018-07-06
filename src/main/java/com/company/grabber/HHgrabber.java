package com.company.grabber;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;



public class HHgrabber {
    private static final String URL_HH="https://api.hh.ru/vacancies?area=1202&specialization=1";
    private static final String COUNT_VACANCIES_ON_PAGE ="per_page=50";
    private static List<VacancyDto> vacancies;

    public static List<VacancyDto> getVacancies() {
        return vacancies;
    }

    static {
        try {
            String responseSite = getVacancy();
            vacancies = parseVacancies(responseSite);
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }


    private static String getVacancy() throws IOException {
        URL URL=new URL(URL_HH+"&"+ COUNT_VACANCIES_ON_PAGE);
        HttpURLConnection httpURLConnection=(HttpURLConnection) URL.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent","Mozilla/5.0");
        httpURLConnection.connect();
        InputStream inputStream = httpURLConnection.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
        String result=br.readLine();
        br.close();
        httpURLConnection.disconnect();
        return result;
    }
    private static List<VacancyDto> parseVacancies(String responseSite) throws ParseException {
        List<VacancyDto> result=new ArrayList<VacancyDto>();
        JSONParser jsonParser=new JSONParser();
        JSONArray jsonArray=(JSONArray) ((JSONObject) jsonParser.parse(responseSite)).get("items");
        for (int i=0;i<jsonArray.size();i++){
            VacancyDto vacancy=new VacancyDto();
            JSONObject tmp=(JSONObject) jsonArray.get(i);
            vacancy.setName((String) tmp.get("name"));
            vacancy.setDateOfPublication((String) tmp.get("published_at"));
            vacancy.setUrl((String) tmp.get("alternate_url"));
            if (tmp.get("salary") != null){
                StringBuilder stringBuilder=new StringBuilder();
                JSONObject salary= (JSONObject) jsonParser.parse(((JSONObject) tmp.get("salary")).toJSONString());
                Object to=salary.get("to");
                Object from=salary.get("from");
                if (to != null){
                    stringBuilder.append("to "+to.toString()+" ");}
                if (from != null){
                    stringBuilder.append("from "+from.toString());}
                vacancy.setSalary( stringBuilder.toString());
            }
            JSONObject employer=(JSONObject) tmp.get("employer");
            vacancy.setOrganization(  employer.get("name").toString());
            result.add(vacancy);
        }
        return result;
    }
}
