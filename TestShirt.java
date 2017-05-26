/*program which takes input for 3 shirt from the user like shirt's collar length,sleeve lenth and material.initially all three things are initialized 
  to some default values and laters it sets as per the need of the user..and after taking the inputs it shows the output of data what user has 
  selected */
import java.util.*;
class Shirt{
     private float clrSize;//contains collar size
     private float slvLength;//contains sleeve length
     private String srtMaterial=new String();//contains shirt materials
     Scanner sc=new Scanner(System.in);
        public Shirt(){//constructor which initializes all these instance variable to some default value.
               clrSize=15;
               slvLength=40;
               srtMaterial="Cotton";
            
        }

        public void setClrSize(){//method which set collar size
              System.out.println("Enter shirt's collar size");
              clrSize=sc.nextFloat();
              
        }
      
            public void getClrSize(){//method which gives output collar size
                 System.out.println("shirt's collar size is"+clrSize);
            }

                public void setSlvLength(){//method which sets slleve length
                      System.out.println("Enter shirt's slleve length");
                      slvLength=sc.nextFloat();
                } 
          
                    public void getSlvLength(){//method which gives output sleeve length
                          System.out.println("shirt's sleeve length is"+slvLength);
                    }
                     
                        public void setSrtMaterial(){//method which sets shirt material
                               System.out.println("Enter shirt's material");
                               srtMaterial=sc.next();
                        }

                            public void getSrtMaterial(){//method which gives output shirt material
                                  System.out.println("shirt's material is"+srtMaterial);
                            } 
 
}

public class TestShirt{
    
     public static void main(String []args){
           int i;
           
           Shirt srt[]=new Shirt[3];//array declaration of objects of shirt class

                for(i=0;i<3;i++){
                      System.out.println("Enter data for material "+(i+1));
                      srt[i]=new Shirt();//initialization of object of Shirt class
                      srt[i].setSrtMaterial();
                      srt[i].setSlvLength();
                      srt[i].setClrSize();
                      System.out.println("\n");
                  }

                     for(i=0;i<3;i++){//gives the output of the data entered by user
                          System.out.println("\n\n ");
                      
                          srt[i].getSrtMaterial();
                          srt[i].getSlvLength();
                          srt[i].getClrSize();
                    }
     
     }

}
