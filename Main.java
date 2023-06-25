/* Psedocode
- Calls instruction method 
- Prompts user to pick desired terminal (assuming user is already AT terminal)
  - Alyssa: Terminal 1 & 2
  - Kenny: Terminal 3 & 5
- Prompts user to select concourse 
- Prompts user to pick gate (by range)
*/

import java.util.*;
  
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    startNote(kb); 
  }

  /**
  *  This is the user's instruction on using the program 
  */
  public static void startNote(Scanner kb){
    String answer = "";
    System.out.println("*****");
    System.out.println("Welcome user! This program guides you to a specific gate in O'Hare International Airport");
    System.out.println("How to use:");
    System.out.println("* Pick between terminal 1, 2, 3 and 5");
    System.out.println("* Once you've pick your terminal, you will be prompted to choose your concourse");
    System.out.println("* As you pick both terminal and concourse, you get to pick your gate");
    System.out.println("* With limited time, gate number will be chosen in ranges, for example (1 - 5)");
    System.out.println("*****");
    System.out.print("Type \"ok\" to proceed:");
    answer = kb.nextLine();
    if (answer.equalsIgnoreCase("ok")){
      concourseChoice(kb,terminalList(kb));
    }
    else{
    } // do nothing 
  }
  
  /**
  *  This is used to list the terminals that a user can pick from as their starting point
  **/
  public static String terminalList(Scanner kb){
    // declaring 
    boolean terminalInput = true; // boolean for while 
    boolean concourseInput = true;
    String concourse = "";

    // choosing terminal 
    while(terminalInput){
      terminalInput = false; //assume false means if else not triggered, stays false (stops)
      // prompts 
      System.out.println("Which terminal will you be starting at?");
      int terminal = kb.nextInt();
      kb.nextLine();
      
      // if 1 was chosen 
      if (terminal == 1){
        while(concourseInput){
          concourseInput = false;
          System.out.println("You have selected Terminal 1. Which concourse would you like to go to, B or C.");
          concourse = kb.nextLine();
            if(concourse.equalsIgnoreCase("b")){
              concourse = "b";
            }
            else if (concourse.equalsIgnoreCase("c")){
              concourse = "c";
            }
            else{
              System.out.println("Please enter a vaild concourse.");
              concourseInput = true; // keeps the while running
          }
        }
      }

      // if 2 was chosen 
      else if(terminal == 2){
        while(concourseInput){
          concourseInput = false;
          System.out.println("You have selected Terminal 2. Which concourse would you like to go to, E or F.");
          concourse = kb.nextLine();
            if(concourse.equalsIgnoreCase("e")){
            }else if (concourse.equalsIgnoreCase("f")){
            }else{
              System.out.println("Please enter a vaild concourse.");
              concourseInput = true; // keeps the while running
            }
          }
       } 

      // if 3 was chosen 
      else if(terminal == 3){
        while(concourseInput){
          concourseInput = false;
          System.out.println("You have selected Terminal 3. Which concourse would you like to go to, G, H, K, or L.");
          concourse = kb.nextLine();
        if(concourse.equalsIgnoreCase("g")){
         }
         else if(concourse.equalsIgnoreCase("h")){
         }
          else if(concourse.equalsIgnoreCase("k")){
         }
         else if(concourse.equalsIgnoreCase("l")){
         }
          else{
          System.out.println("Please enter a vaild concourse.");
          concourseInput = true; // keeps the while running
          }
        }
      } 
      
      // if 5 was chosen 
      else if(terminal == 5){
        System.out.println("You have selected Terminal 5. Concouse M is the only avalible option."); 
        concourse = "M";
     } 

      // invalid input 
      else {
        System.out.println("Not a valid terminal please input a vaild terminal number.");
        terminalInput = true;
     }
   }
    return concourse;
  }
  
  /**
  * Method for 
  */
  public static void concourseChoice(Scanner kb, String concourseChoice){
    String gate = "";
    boolean choiceInput = true;
    
    // Terminal 1 Concourse B
    if (concourseChoice.equalsIgnoreCase("B")){
      while(choiceInput){
        choiceInput = false;
        System.out.println("Is your gate between: \nA)B1-B6 \nB)B7-B8 \nC)B9-B14 \nD)B16-B18 \nE)B19-B24 ");
        gate = kb.nextLine();
        if(gate.equalsIgnoreCase("A"))
        {
          System.out.println("As you passed TSA checkpoint");
          System.out.println("Head to the left");
          System.out.println("If your gate is between 1 and 3, your gate will be at the very corner");
          System.out.println("If your gate is between 5 and 6, your gate should be on your right side");
        }
        else if(gate.equalsIgnoreCase("B")){
          System.out.println("As you passed TSA checkpoint");
          System.out.println("Gate 7 and 8 should be directly infront of you");
        }
        else if(gate.equalsIgnoreCase("C")){
          System.out.println("As you passed TSA checkpoint");
          System.out.println("Head to the right");
          System.out.println("As you walk, gates should be on your left");
          System.out.println("If your gate is B9, it should be the first one you see");
          System.out.println("The gate number increases as you walk, and gate B14 will be the last on your left side");
        }
        else if(gate.equalsIgnoreCase("D")){
          System.out.println("As you passed TSA checkpoint");
          System.out.println("Head to the right and walk passed gate B9 till B14");
          System.out.println("As you reach gate B14, walk straight and you will see multiple gates in a corner ahead of you");
          System.out.println("Starting from the left is gate B16, and onwards to the right being gate B18");
        }
        else if(gate.equalsIgnoreCase("E")){
          System.out.println("As you passed TSA checkpoint");
          System.out.println("Head to the right and walk passed gate B9 till B14");
          System.out.println("As you reach gate B14, and before gate B16");
          System.out.println("Head over to the hall on your right");
          System.out.println("Walk straight, along the curve");
          System.out.println("You should passed by gate B19 first, if that is your gate, yay");
          System.out.println("If not, walk forward towards gate B20");
          System.out.println("If you still haven't reach your gate, B21 - B24 should be at the very corner of the curved hallway");
        }        
        else{
          System.out.println("pick between A/B/C..etc");
          choiceInput = true;
        }
      }
      System.out.println("Thank you for using this program, have a safe flight!");
    }
        
    // Terminal 1 Concourse C
    else if (concourseChoice.equalsIgnoreCase("C")){
      while(choiceInput){
        choiceInput = false;
        System.out.println("Is your gate between: \nA)C1-C9 \nB)C10-C17 \nC)C18-C21 \nD)C22-C31");
        gate = kb.nextLine();
        if(gate.equalsIgnoreCase("A"))
        {
          System.out.println("As you passed TSA checkpoint");
          System.out.println("Head Straight till you see an escalator down");
          System.out.println("Walk straight till you get to concourse C");
          System.out.println("As you arrive in concourse C, take a left");
          System.out.println("Walk straight passed C10");
          System.out.println("If your gate is C1, it should be directly straight");
          System.out.println("If not, and your gate is an odd number, it should be on your left");
          System.out.println("If even, your gate should be on your right");
        }
        else if(gate.equalsIgnoreCase("B")){
          System.out.println("As you passed TSA checkpoint");
          System.out.println("Head Straight till you see a escalator down");
          System.out.println("Walk straight till you get to concourse C");
          System.out.println("As you arrive in concourse C, take a left"); 
          System.out.println("If your gate is an odd number, it should be on your left");
          System.out.println("If your gate is an even number, it should be on your right");
        }
        else if(gate.equalsIgnoreCase("C")){
          System.out.println("As you passed TSA checkpoint");
          System.out.println("Head Straight till you see a escalator down");
          System.out.println("Walk straight till you get to concourse C");
          System.out.println("Head to the right");
          System.out.println("If your gate is an off number, it should be on the right");
          System.out.println("If your gate is an even number, it should be on your left");
        }
        else if(gate.equalsIgnoreCase("D")){
          System.out.println("As you passed TSA checkpoint");
          System.out.println("Head Straight till you see a escalator down");
          System.out.println("Walk straight till you get to concourse C");
          System.out.println("Head to the right");
          System.out.println("Walk passed gate C21 and C20");
          System.out.println("Walk forward till the end of the hallway");
          System.out.println("If your gate is an even number, it should be on your left");
          System.out.println("If your gate is an odd number, it should be on your right");
        }      
        else{
          System.out.println("pick between A/B/C..etc");
          choiceInput = true;
        }      
      }
      System.out.println("Thank you for using this program, have a safe flight!");
    }

    // Terminal 2 Concourse E
    else if (concourseChoice.equalsIgnoreCase("E")){
      while(choiceInput){
        choiceInput = false;
        System.out.println("Is your gate between: \nA)E1-E4 \nB)E5-E17 ");
        gate = kb.nextLine();
        if(gate.equalsIgnoreCase("A")){
          System.out.println("As you passed TSA checkpoint");
          System.out.println("Head over to the main Hall");
          System.out.println("If your gate is E1, walk right, and your gate should be at the very end, left side");
          System.out.println("If your gate is between E2-E4, walk straight");
          System.out.println("Gate E2-E4 should be on your right side");
        }
        else if(gate.equalsIgnoreCase("B")){
          System.out.println("As you passed TSA checkpoint");
          System.out.println("Head over to the main Hall");
          System.out.println("Walk straight, passed gate E4");
          System.out.println("Turn right to the hallway");  
          System.out.println("If your gate is E5, it should be the first one of the right"); 
          System.out.println("Otherwise if your gate is an even number, it should be on your right side along the hall"); 
          System.out.println("If your gate is an odd number, it should be on your left side along the hall");
        }
        else{
          System.out.println("pick between A/B");
          choiceInput = true;
        }    
      }
      System.out.println("Thank you for using this program, have a safe flight!");
    }
        
    // Terminal 2 Concourse F
      else if (concourseChoice.equalsIgnoreCase("F")){
        while(choiceInput){
        choiceInput = false;
        System.out.println("Is your gate between: \n A)F1-F7 \n B)F9-F28");
        gate = kb.nextLine();
        if(gate.equalsIgnoreCase("A")){
          System.out.println("After passing TSA in Terminal 2 if you rgate is F1-F3 take a Left and walk down the Main hall");
            System.out.println("If you are at gates F4-F7 go stright"); 
            System.out.println("F4-F6 will be on the left"); 
            System.out.println("F7 will be around teh bend on the left");
          }
          else if(gate.equalsIgnoreCase("B")){
            System.out.println("After passing TSA in Terminal 2 wlak stright");
            System.out.println("When you get to the fork take a left"); 
            System.out.println("If you head down the hall you will see gates on teh left and right of you"); 
            System.out.println("If your gate is an odd number it will be on your left"); 
            System.out.println("If your gate is an even number it will be on your right");
          }
          else { 
          System.out.println("pick between A/B");
          choiceInput = true; 
          }      
        }
      System.out.println("Thank you for using this program, have a safe flight!");
      }
          
    // Terminal 3 Concourse G
    else if (concourseChoice.equalsIgnoreCase("G")){
        while(choiceInput){
        choiceInput = false;
        System.out.println("Is your gate between: \n A)G1-G12 \n B)G16-G20");
        gate = kb.nextLine();
        if(gate.equalsIgnoreCase("A")){
            System.out.println("After passing TSA in Terminal 3 take a right and walk down the hall");
            System.out.println("You will enter into a rotunda"); 
            System.out.println("Enter the hall to your left"); 
            System.out.println("There if you walk down the hall you will find the gates on either side of you");
            System.out.println("If your gate is an odd number it will be on your left"); 
            System.out.println("If your gate is an even number it will be on your right");
           }
          else if(gate.equalsIgnoreCase("B")){
            System.out.println("After passing TSA in Terminal 3 take a right and walk down the hall");
            System.out.println("You will enter into a rotunda"); 
            System.out.println("Enter the hall to your left"); 
            System.out.println("There if you walk down the hall you will find the gates on either side of you");
            System.out.println("Your gate will be at the end of the hall"); 
            }
        
          else { 
          System.out.println("pick between A/B/C..etc");
          choiceInput = true; 
          }      
        }
      System.out.println("Thank you for using this program, have a safe flight!");
      }
      
        // Terminal 3 Concourse H
      else if (concourseChoice.equalsIgnoreCase("H")){
        while(choiceInput){
        choiceInput = false;
        System.out.println("Is your gate between: \n A)H1-H2 \n B)H3-H5 \n C)H6-H12 \n D)H14-H18");
        gate = kb.nextLine();
        if(gate.equalsIgnoreCase("A")){
            System.out.println("After passing TSA in Terminal 3 take a right and walk down the hall");
            System.out.println("Stop before the rotunda"); 
            System.out.println("Your gate should be on the left"); 
            System.out.println("If you made it to the hall that leads to the rotunda then you have gone to far");
         }
        else if(gate.equalsIgnoreCase("B")){
            System.out.println("After passing TSA in Terminal 3 walk forward");
            System.out.println("Gate H3 will be to your right"); 
            System.out.println("For gate H4 and H5 keep walking and it will be around the bend to teh right"); 
            System.out.println("Your gate will be on the right after the bend");
             
         }
          else if(gate.equalsIgnoreCase("C")){
            System.out.println("After passing TSA in Terminal 3 walk forward");
            System.out.println("When you get to the fork take a right"); 
            System.out.println("There if you walk down the hall you will find the gates on either side of you");
            System.out.println("If your gate is an odd number it will be on your left"); 
            System.out.println("If your gate is an even number it will be on your right");
          }
          else if(gate.equalsIgnoreCase("D")){
            System.out.println("After passing TSA in Terminal 3 walk forward");
            System.out.println("When you get to the fork take a right"); 
            System.out.println("There if you walk down the hall you will find the gates on either side of you");
            System.out.println("Your gate will be at the end of the hall");
            }
        
          else { 
            System.out.println("pick between A/B/C..etc");
            choiceInput = true; 
          }      
        }
      System.out.println("Thank you for using this program, have a safe flight!");
      }
        
        // Terminal 3 Concourse K
        else if (concourseChoice.equalsIgnoreCase("K")){
          while(choiceInput){
          choiceInput = false;
          System.out.println("Is your gate between: \n A)K1 \n B)K2-K4 \n C)K5-K5 \n D)K16-20");
          gate = kb.nextLine();
          if(gate.equalsIgnoreCase("A")){
            System.out.println("After passing TSA in Terminal 3 take a left and walk down the hall");
            System.out.println("Stop before concourse L"); 
            System.out.println("Your gate should be on the Right"); 
          }
          else if(gate.equalsIgnoreCase("B")){
            System.out.println("After passing TSA in Terminal 3 walk forward");
            System.out.println("Gate K2 and K3 will be to your Left"); 
            System.out.println("For gate K4 walking and it will be around the bend to the left"); 
            System.out.println("Your gate will be on the Left after the bend");
             
          }
          else if(gate.equalsIgnoreCase("C")){
            System.out.println("After passing TSA in Terminal 3 walk forward");
            System.out.println("When you get to the fork take a Left"); 
            System.out.println("There if you walk down the hall you will find the gates on either side of you");
            System.out.println("If your gate is an odd number it will be on your left"); 
            System.out.println("If your gate is an even number it will be on your right");
          }
          else if(gate.equalsIgnoreCase("D")){
            System.out.println("After passing TSA in Terminal 3 walk forward");
            System.out.println("When you get to the fork take a Left"); 
            System.out.println("There if you walk down the hall you will find the gates on either side of you");
            System.out.println("Your gate will be at the end of the hall");
          }
        
          else { 
            System.out.println("pick between A/B/C..etc");
            choiceInput = true; 
          }      
        }
      System.out.println("Thank you for using this program, have a safe flight!");
      }
          
      // Terminal 3 Concourse L
       else if (concourseChoice.equalsIgnoreCase("L")){
        while(choiceInput){
        choiceInput = false;
        System.out.println("Is your gate between: \n A)L1-11 \n B)L20-L24");
        gate = kb.nextLine();
        if(gate.equalsIgnoreCase("A")){
            System.out.println("After passing TSA in Terminal 3Walk left");
            System.out.println("When you get to the end take a right into the hall"); 
            System.out.println("There if you walk down the hall you will find the gates on either side of you");
            System.out.println("If your gate is an odd number it will be on your left"); 
            System.out.println("If your gate is an even number it will be on your right");
          }
          else if(gate.equalsIgnoreCase("B")){
            System.out.println("After passing TSA in Terminal 3Walk left");
            System.out.println("When you get to the end take a right into the hall");
            System.out.println("Take the first left and head down the hall");
            System.out.println("There your gate on the right");
            }
          else { 
            System.out.println("pick between A/B");
            choiceInput = true; 
          }      
        }
      System.out.println("Thank you for using this program, have a safe flight!");
       }
         
      // Terminal 3 Concourse M
       else if (concourseChoice.equalsIgnoreCase("M")){
        while(choiceInput){
        choiceInput = false;
        System.out.println("Is your gate between: \n A)M1-M2 \n B)M3-M8 \n C)M9-M13 \n D)M14-M17 \n E)M18-M30 \n F)M32-M40");
        gate = kb.nextLine();
        if(gate.equalsIgnoreCase("A")){
            System.out.println("After passing TSA in Terminal 5 take a right and walk down the hall");
            System.out.println("You will enter into a small round room"); 
            System.out.println("You will find your gates in the room"); 
           }
          else if(gate.equalsIgnoreCase("B")){
            System.out.println("After passing TSA in Terminal 5 take a right and walk down the hall");
            System.out.println("There if you walk down the hall you will find the gates to your left");
            }
          else if(gate.equalsIgnoreCase("C")){
            System.out.println("After passing TSA in Terminal 5 take a right and to teh curved wall");
            System.out.println("There you will find teh gates along the wall");
            }
          else if(gate.equalsIgnoreCase("D")){
            System.out.println("After passing TSA in Terminal 5 walk forward");
            System.out.println("There you will find the gates in front of you");
            }
          else if(gate.equalsIgnoreCase("E")){
            System.out.println("After passing TSA in Terminal 5 take a Left and walk down the hall");
            System.out.println("There if you walk down the hall you will find the gates to your right");
          }
          else if(gate.equalsIgnoreCase("F")){
            System.out.println("After passing TSA in Terminal 5 take a Left and walk down the hall");
            System.out.println("There if you walk down the hall you will see gates to your right");
            System.out.println("Keep walking to the end of the hall");
            System.out.println("There you will the gates along the wall in front of you");
          }
          else { 
            System.out.println("pick between A/B/C..etc");
            choiceInput = true; 
          }      
        }
      System.out.println("Thank you for using this program, have a safe flight!");
      }
    }
  }

  
