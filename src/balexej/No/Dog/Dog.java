package balexej.No.Dog;

 class Dog {
   int size;
   String name;

   void bark(){
       if (size>60){
           System.out.println("Гав,Гав");
       }else if (size>14){
           System.out.println("Вуф, вуф");
       }else{
           System.out.println("Тяф, тяф");
       }
   }
}
