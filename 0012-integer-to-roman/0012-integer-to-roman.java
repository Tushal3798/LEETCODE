class Solution {
    public String intToRoman(int num) {
        String str = "";
        
        while(num  >= 1000){
            str += 'M';
            num = num - 1000;
        }
            
        if(num/100 == 9){
            str = str + "CM";
            num -= 900;
        }
            
        if(num >= 500){
            str = str + 'D';
            num -= 500;
        }
            
        if(num/100 == 4){
            str = str + "CD";
            num -= 400;
        }
            
        while(num >= 100){
            str = str + 'C';
            num -= 100;
        }
            
        if(num/10 == 9){
            str = str + "XC";
            num -= 90;
        }
            
        if(num >= 50){
            str = str + 'L';
            num -= 50;
        }
            
        if(num/10 == 4){
            str = str + "XL";
            num -= 40;
        }
            
        while(num >= 10){
            str = str + 'X';
            num -= 10;
        }
            
        if(num == 9){
            str = str + "IX";
            num -= 9;
        }
            
        if(num >= 5){
            str = str + 'V';
            num -= 5;
        }
            
        if(num == 4){
            str = str + "IV";
            num -= 4;
        }
            
        while(num >= 1){
            str = str + 'I';
            num -= 1;
        }
        return str;
    }
}