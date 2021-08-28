class RaindropConverter {

    String convert(int number) {

        String drops = "";

       if(isFactor(number, 3) || isFactor(number, 5) || isFactor(number, 7)) {
           if(isFactor(number, 3))
               drops += "Pling";
           if(isFactor(number, 5))
               drops += "Plang";
           if(isFactor(number, 7))
               drops += "Plong";
       }
        else
            drops = Integer.toString(number);

        return drops;
    }

    boolean isFactor(int number, int factor){
        return number % factor == 0;
    }

}
