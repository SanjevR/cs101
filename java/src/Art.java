public class Art {

public static void main(String[] args) {
   

/* Let's pretend we are in an art museum and I've been tasked
with taking inventory of the statues in this museum. There are 
cat, dog, pig and jackal statues. Let's gooo!!!!!
*/

int cats = 1;
int dogs = 3;
int jackals = 15;
int pigs = 3;

while(cats> 0 && dogs > 0 && jackals > 0 && pigs > 0 ){
    if(cats < dogs){
        System.out.println("Who says cats and dogs can't get along? Tama and Friends do do do do!");
      
         
    } else if( cats > jackals){
         System.out.println("yo whos been messing with my inventory? Was it you Bob?");
         break;
    } else if (pigs != dogs){
        System.out.println("The dog herded the pigs!");
        break;

    } else{
        System.out.println("I think someone robbed the museum?");
        
    }

}

return;
}



}
