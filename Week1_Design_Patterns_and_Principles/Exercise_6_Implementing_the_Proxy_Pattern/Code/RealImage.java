import Iimage.Image;

import java.awt.*;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String s){
        this.fileName = s;
        loadFromServer();
    }

    private void loadFromServer(){
        System.out.println("Loading from remote server" + this.fileName);
    }

    @Override
    public void display(){
        System.out.println("Displaying Image"  +  this.fileName );
    }

}
