pipeline {
    agent any

    stages {
        stage('checkout') {
            steps {
                sh checkout scm
            }
        }
      stage('buld & Test')
          steps {
              sh 'mvn clean install'
            }
       }
    }
}
