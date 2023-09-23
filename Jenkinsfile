pipeline {
    agent any

    stages {
        stage('Récupération du code source depuis le référentiel Git') {
            steps {
                checkout scm
            }
        }
        stage('Affichage de la date système') {
            steps {
                sh 'date'
            }
        }
    }
}
