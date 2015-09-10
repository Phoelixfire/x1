//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
      // Position of creature.
float dx, dy;     // Speed.
float horizon;
float x = 1;
float y = 100;
float speed = 1;


//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 700,300);
  horizon=  height/2;


  
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( #1D254D);                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/2, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  noStroke();
    fill(#50431F);
  triangle( 150,horizon, 120,horizon, 135,horizon-100  ); 
 fill( 100,200,100 );
   triangle( 155,horizon-20, 115,horizon-20, 135,horizon-100  );
  triangle( 155,horizon-20, 115,horizon-20, 135,horizon-80  ); 
  // tree

  text( "The Tree Has Been Fixed", 150,horizon );
                                            // house

  fill(0);
  text( "My name is Felix", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
 
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(200,50,166);    /* REPLACE THIS WITH YOUR OWN CODE! */
  text( "Optimus Prime", x-25,horizon-25 );


  move();
  display();
}

void move() {
  x = x + speed;
  if (x > width) {
    x = 0;
  }
}

void display() {
  fill(#E9222F);
  rect(x,horizon-12,30,10);   //head
  fill(#3C28EF);
  rect(x,horizon-15,25,13);   //body
 fill(#EFEF28);
  ellipse(x+5,horizon-1,5,5);     //wheel left
  fill(#EFEF28);
  ellipse(x+20,horizon-1,5,5);     //wheel right
  
}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  speed=  random( 0, +50 );                  // random speed.
 
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
   
   

