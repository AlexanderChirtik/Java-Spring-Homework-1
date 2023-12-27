package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class App
{
    public static void main( String[] args )
    {
        Person person = new Person("Алексей", "Иванов", 23);

        /**
         * Использование org.apache.commons.lang3
         */
        System.out.println(ToStringBuilder.reflectionToString(person));
        System.out.println(StringUtils.equals(person.getFirstName(), person.getLastName()));
        System.out.println(ArrayUtils.hashCode(person.getAge()));

        /**
         * Использование com.google.code.gson
         */
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
