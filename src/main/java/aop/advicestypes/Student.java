package aop.advicestypes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
  private String NameSurname;
  private int course;
  private double angGrade;


}
