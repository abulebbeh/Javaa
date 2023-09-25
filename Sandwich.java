public class Sandwich
{
   
  // the private data members
     String mainIngredient;
     String bread;
     double price;

  // the public get and set methods

     public void setMainIngredient(String ingredient){
        this.mainIngredient = ingredient;
     }

     public String getMainIngredient(){
	    return mainIngredient;
     }
     public void setBread(String breadType){
	    this.bread = breadType;
     }
     public String getBread(){
	    return bread;
     }
     public void setPrice(double amt){
	    this.price = amt;
     }

     public double getPrice(){
	    return price;
     }
     public static void main(String[] args){
         Sandwich tunaSandwich = new Sandwich();
         tunaSandwich.setMainIngredient("Tuna");
         tunaSandwich.setBread("Wheat");
         tunaSandwich.setPrice(4.99);

         System.out.println("Main ingredient: " + tunaSandwich.getMainIngredient());
         System.out.println("Bread: " + tunaSandwich.getBread());
         System.out.println("Price: " + tunaSandwich.getPrice());
     }

}
