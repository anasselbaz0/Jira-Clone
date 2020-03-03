node {
  stage ('Git Chekout') {
    git 'https://github.com/anasselbaz0/Jira-Clone'
  }
  stage ('Compile package') {
    def mvnHome = tool name: '', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
}
