pipeline {
 agent any
   stages {
     stage ('Checkout Stage') {
       steps {
          git branch: 'master', url: 'https://github.com/brad-jivedh/hello-world.git'
       }
     }
        stage ('Build stage') {
          steps {
              sh '/opt/apache-maven-3.9.6/bin/mvn clean install -Dmaven.test.skip=true'
       }
     }
        stage ('Push') {
          steps {
            echo "This is the push stage"
            }
     }
        stage ('Deploy') {
          steps {
            sh 'sudo rsync /var/lib/jenkins/workspace/tomcat/target/*.war ubuntu@52.66.210.6:/opt/apache-tomcat-9.0.87/webapps/'       }
     }
   }
}

