package com.moonlit.myspring;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class MoonlightPoet implements Perform {
    private String name;
    private int age;
    private Poem poem;
    private List<String> list;
    private Map<String, String> map2;

    @Override
    public void perform() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        poem.recite();
        for (String val : list)
            System.out.println("in list : " + val);
        for (Entry<String, String> entry : map2.entrySet())
            System.out.println("in map : " + entry.getKey() + " -- " + entry.getValue());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Poem getPoem() {
        return poem;
    }
    public void setPoem(Poem poem) {
        this.poem = poem;
    }
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap2() {
        return map2;
    }

    public void setMap2(Map<String, String> map2) {
        this.map2 = map2;
    }
}
