package com.amiabledata.archertracker.score;

import com.amiabledata.archertracker.score.Score;
import java.util.ArrayList;
import java.util.Iterator;

public class IndividualQualificationScore extends Score{
  private ArrayList<Integer> value;
    private Integer sum;
    private Integer tenPlusX;
    private Integer amountOfX;
    
      //Qualitative Variable
    private String[]TotalScoreRange = {"novice","intermediate","professional","expert","veteran","master"};
    private String Message = "error";
    private String[][]SkillRange = {{"poor","good","average","very good","excellent"},{"unskilled","accurate","remarkable"}};

    public IndividualQualificationScore() {
        setSetNumber(0);
        this.value = new ArrayList<Integer>();
        this.sum = 0;
        this.tenPlusX = 0;
        this.amountOfX = 0;
    }

    public IndividualQualificationScore(IndividualQualificationScore value) {
        setSetNumber(value.getSetNumber());
        setValue(value.getAllValue());
    }

    public void setValue(ArrayList<Integer> value) {
        this.value = new ArrayList<Integer>();
        this.value.addAll(value);
        reevaluate();
    }

    public void addValue(Integer value) {
        this.value.add(value);
        reevaluate();
    }

    public ArrayList<Integer> getAllValue() {
        return this.value;
    }
    public Integer getValue(Integer Index) {
        return this.value.get(Index);
    }

    private void reevaluate() {
        sum = 0;
        tenPlusX = 0;
        amountOfX = 0;

        for(Iterator<Integer> it = this.value.iterator(); it.hasNext();) {
            Integer n = it.next();
            if(n >= 10) {
                if(n >= 11) {
                    amountOfX++;
                }
                tenPlusX++;
                sum += 10;
            } else {
                sum += n;
            }
        }
    }

    public Integer getSum() {
        reevaluate();
        return this.sum;
    }

    public Integer getTenPlusX() {
        reevaluate();
        return this.tenPlusX;
    }

    public Integer getAmountOfX() {
        reevaluate();
        return this.amountOfX;
    }
    //Qualitative Variable method
    public void TotalScoreRange(){
       if(getSum()>0 && getSum()<=300)
       {
           System.out.println(TotalScoreRange[0]);
       }
       else if(getSum()>= 301 && getSum()<=450){
            System.out.println(TotalScoreRange[1]);
       }
       else if(getSum()>=451 && getSum()<=550){
           System.out.println(TotalScoreRange[2]);
       }
       else if(getSum()>=551 && getSum()<=630){
           System.out.println(TotalScoreRange[3]);
       }
       else if(getSum()>=631 && getSum()<=680){
           System.out.println(TotalScoreRange[4]);
       }
       else if(getSum()>=681 && getSum()<=720){
           System.out.println(TotalScoreRange[5]);
       }
        
}
    public String TotalScoreRange2(){
       if(getSum()>0 && getSum()<=300)
       {
           return TotalScoreRange[0];
       }
       else if(getSum()>= 301 && getSum()<=450){
            return TotalScoreRange[1];
       }
       else if(getSum()>=451 && getSum()<=550){
           return TotalScoreRange[2];
       }
       else if(getSum()>=551 && getSum()<=630){
          return TotalScoreRange[3];
       }
       else if(getSum()>=631 && getSum()<=680){
          return TotalScoreRange[4];
       }
       else if(getSum()>=681 && getSum()<=720){
           return TotalScoreRange[5];
       }
       else
           return Message;
    }
    public void TenPlusXSkill(){
        if(getTenPlusX() >= 15){
            System.out.println(SkillRange[0][4]);
        }
        else if(getTenPlusX()>=10 && getTenPlusX()<=14){
            System.out.println(SkillRange[0][3]);
        }
        else if(getTenPlusX()>=5 && getTenPlusX()<= 9){
            System.out.println(SkillRange[0][2]);
        }
        else if(getTenPlusX()>=3 && getTenPlusX()<= 4){
            System.out.println(SkillRange[0][1]);
        }
        else if(getTenPlusX()<3){
            System.out.println(SkillRange[0][0]);
        }
    }
    public String TenPlusXSkill2(){
         if(getTenPlusX() >= 15){
             return SkillRange[0][4];
        }
        else if(getTenPlusX()>=10 && getTenPlusX()<=14){
            return SkillRange[0][3];
        }
        else if(getTenPlusX()>=5 && getTenPlusX()<= 9){
            return SkillRange[0][2];
        }
        else if(getTenPlusX()>=3 && getTenPlusX()<= 4){
            return SkillRange[0][1];
        }
        else if(getTenPlusX()<3){
           return SkillRange[0][0];
        }
        else
            return Message;
    }
     public void XSkill(){
        if(getAmountOfX() >= 5){
            System.out.println(SkillRange[1][2]);
        }
        else if(getAmountOfX()>= 1 && getAmountOfX()<5){
            System.out.println(SkillRange[1][1]);
        }
        else if(getAmountOfX() == 0){
            System.out.println(SkillRange[1][0]);
        }
    }
     public String XSkill2(){
        if(getAmountOfX() >= 5){
            return SkillRange[1][2];
        }
        else if(getAmountOfX()>= 1 && getAmountOfX()<5){
            return SkillRange[1][1];
        }
        else if(getAmountOfX() == 0){
            return SkillRange[1][0];
        }
        else
            return Message;
     }
}
