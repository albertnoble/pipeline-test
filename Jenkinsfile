pipeline {
    agent any

    tools {
	      maven 'Maven 3.5.4'
        jdk 'jdk11'
    }

    stages {
        stage ('Compile Stage') {

            steps {
                    sh 'mvn clean compile'
            }
        }

        stage ('Testing Stage') {

            steps {
                    sh 'mvn test'
            }
        }
    }
}