package MethodsHw;

public class Student {
    /*
    task: Create class Student that will have a method getGrade.
    Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
     */
    String getGrade(int score){
        String grades;
        if(score>90){
           grades="A";
        }else if(score>80){
            grades="B";
        }else if(score>70){
            grades="C";
        }else if(score>50){
            grades="D";
        }else{
            grades="F";
        }
       return grades;
    }

    public static void main(String[] args) {
        Student grades= new Student();
        int num=95;
        String str=grades.getGrade(num);
        System.out.println(str);

        Student gradeOne= new Student();
        String str2=grades.getGrade(55);
        System.out.println(str2);
    }
    }
