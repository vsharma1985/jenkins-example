pipeline {
    agent any
        tools {
        maven 'Maven 3.6.3'
        jdk 'jdk 8'
    }

    stages {
        stage ("initialize") {
            steps {
            sh '''
            echo "PATH = ${PATH}"
            echo "M2_HOME = ${M2_HOME}"
            '''
            }
        }
        
        stage ('Compile Stage') {

            steps {
                sh 'mvn clean compile'
                }
            }
        }
        
        stage ('Test Stage') {

            steps {
                sh 'mvn test'
                }
            }
        }
    
    stage ('Package Stage') {

            steps {
                 sh 'mvn package'
                }
            }
        }
    
    
        
        
    }
}
   
   
   
   
