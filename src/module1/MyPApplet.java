package module1;

import processing.core.*;
import processing.core.PImage;

public class MyPApplet extends PApplet {


        public void setup() {
            //Add setup code for MyPApplet
            size(400,400);				//set canvas size
            background(200,200,200);			//set canvas color


        }

        @Override
        public void draw() {
            fill(255,255,0);
            ellipse(200, 200, 390, 390);

            fill(0,0,0);
            ellipse(120, 130, 50, 70);

            fill(0,0,0);
            ellipse(280, 130, 50, 70);

            noFill();
            arc(200, 230, 160, 160, 0, PI);


        }




    public static void main (String... args) {
            MyPApplet pt = new MyPApplet();
            PApplet.runSketch(new String[]{"Smiling face"}, pt);
        }
    }

