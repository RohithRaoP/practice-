pipeline {
    agent any

    stages {
        stage('checkout') {
            steps {
                 checkout scm
            }
        }
      stage('buld & Test') {
          steps {
              sh 'mvn clean install'
            }
       }
    }
}
