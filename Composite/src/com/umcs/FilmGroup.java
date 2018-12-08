package com.umcs;

import java.util.ArrayList;
import java.util.Iterator;

public class FilmGroup extends FilmComponent {
    ArrayList songComponents =  new ArrayList();

    String groupName;
    String groupDescription;


    public FilmGroup(String newGroupName, String newGroupDescription){
        groupName = newGroupName;
        groupDescription = newGroupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }
    public void add(FilmComponent newFilmComponent){
        songComponents.add(newFilmComponent);
    }
    public void remove(FilmComponent newFilmComponent){
        songComponents.remove(newFilmComponent);
    }

    public FilmComponent getComponent(int componentIdex){
        return (FilmComponent)songComponents.get(componentIdex);
    }

    public void displayFilmInfo(){
        System.out.println( "\n" + getGroupName() + " - " + getGroupDescription());

        Iterator songIterator = songComponents.iterator();

        while(songIterator.hasNext()){
            FilmComponent songInfo = (FilmComponent) songIterator.next();
            songInfo.displayFilmInfo();
        }
    }


}
