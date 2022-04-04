# SingleResponsiblityPrinciple


          The Single Responsiblity Principle represent the "S" of the five SOLID Principle of OOPs.It states
 that,a class should have only one reason to change.This means that. if there is change in a task, only then 
 class should change.
  
         In these project,we have a "Customer" class which has attributes of name,address."Order" class has the
order information like item name;quantity,price."BillCalculation" calculates the total bill.Delivery App has
only one task of delivering the order of customer. 

 BENEFITS OF SINGLE RESPONSIBLITY:
         
         The code quality of the application is better,thereby having fewer defects.
          
          Testing and writing test cases is much simpler.
          
          It becomes more maintainable,easier to understand.


JunitTest:

       The  Junit Test is done of all the entities in  "Single Responsiblity" project and test coverage 
is 100% successful in jacoco report.

       
  SONARQUBE :
          In sonarqube,reliability ,security , securityReview and maintainability is A and 
the code coverage is 100%. 

     
SONARQUBE 

gradle command to publish code to sonarqube
gradlew sonarqube 
  -Dsonar.projectKey=SingleResponsibilityPrinciple 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=c0aa40891849e67ef673d3b164472078f65fd37c