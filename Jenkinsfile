pipeline {
 agent any
   stages {
     stage ('Checkout Stage') {
       steps {
          git branch: 'master', url: 'https://github.com/brad-jivedh/hello-world.git'
       }
     }
        stage ('Buil stage') {
          steps {
              sh 'mvn clean install'
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

