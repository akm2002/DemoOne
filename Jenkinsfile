pipeline {
  agent any
  stages {
    stage('buildProj') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('testRun') {
      steps {
        sh 'mvn test'
      }
    }
    stage('CodeAnalysis') {
      parallel {
        stage('CodeAnalysis') {
          steps {
            hygieiaCodeQualityPublishStep(junitFilePattern: '*Test.xml')
          }
        }
        stage('') {
          steps {
            jiraSearch ' project = DEV AND assignee in (administrator)'
          }
        }
      }
    }
  }
  environment {
    DevUnitTest = ''
  }
}