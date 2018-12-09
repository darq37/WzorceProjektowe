package com.umcs;

import java.util.ArrayList;
import java.util.Iterator;

public class FilmGroup extends FilmComponent {
    ArrayList filmComponents =  new ArrayList();

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
        filmComponents.add(newFilmComponent);
    }
    public void remove(FilmComponent newFilmComponent){
        filmComponents.remove(newFilmComponent);
    }

    public FilmComponent getComponent(int componentIdex){
        return (FilmComponent) filmComponents.get(componentIdex);
    }

    public void displayFilmInfo(){
        System.out.println( "\n" + getGroupName() + " - " + getGroupDescription());

        Iterator filmIterator = filmComponents.iterator();

        while(filmIterator.hasNext()){
            FilmComponent filmInfo = (FilmComponent) filmIterator.next();
            filmInfo.displayFilmInfo();
        }
    }


}
