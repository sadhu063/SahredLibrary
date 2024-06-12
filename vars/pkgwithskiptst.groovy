def call() {  

     //Only the below line will also works
     sh 'mvn package -DskipTests=true' 

     //Define the maven command to be executed
     def mavenCommand = 'mvn package -DskipTests=true' 

     //Execute the maven command in a shell
     sh script: maven command, returnStatus: true     
    
}
