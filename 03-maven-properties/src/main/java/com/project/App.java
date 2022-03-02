package com.project;

import com.google.gson.Gson;

public class App
{
    public static void main( String[] args )
    {
        // create object Gson
        Gson gson = new Gson();

        // create object Person
        Person person = new Person("Albert Einstein");

        // convert object Person to object string jsonusing object gson
        String json = gson.toJson(person);

        // print
        System.out.println(json);
    }
}
