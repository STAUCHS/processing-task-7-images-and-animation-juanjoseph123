import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

 PImage imgPenguin;
 PImage imgbackground;
  
 //x and y coordinates for background
  float fltbackgroundX;
  float fltbackgroundY;
  
  //x and y coordinate for penguin
  float fltPenguinX;
  float fltPenguinY;

  //penguin speed vaiables
  float fltXSpeed = random(1, 5);
  float fltYSpeed = random(1, 5);

//ellipse variables
  float angle = 0;
  float x = 50; 
  float y = height / 2; 
  float amplitude = 100; 
  float frequency = (float) 0.05; 
  float speed = 1; 


    public void settings() {
      size(800, 800);
    }



    public void setup() {
      
      imgbackground = loadImage("background.png");
      //resize the background to fit the window
      imgbackground.resize(800, 800);

    imgPenguin = loadImage("Penguin.png");
    // resize Penguin
    imgPenguin.resize(100,100);
  }



  public void draw() {
    //draw the background
    image(imgbackground, fltbackgroundX, fltbackgroundY); 

    //draw the penguin
    image(imgPenguin, fltPenguinX, 700);

    //move the penguin
    fltPenguinX += fltXSpeed;
    fltPenguinY += fltYSpeed;

    if (fltPenguinX > width - imgPenguin.width || fltPenguinX < 0 ){
      fltXSpeed *= -1;
      
  }
    if(fltPenguinY>height - imgPenguin.height || fltPenguinY < 0) {
      fltYSpeed *= -1;
  }

  
  
   y = height / 2 + sin(angle) * amplitude;
   angle += frequency;
   
   
   x += speed;
   
   
   fill(255, 255, 0);
   ellipse(x, y, 75, 75);
}
}