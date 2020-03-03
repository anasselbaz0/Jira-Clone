node {
  stage ('Git Chekout') {
    git 'https://github.com/anasselbaz0/Jira-Clone'
  }
  stage ('Compile package') {
    def mvnHome = tool name: 'maven-3', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
  stage ('Build docker image') {
    dockerCmd "build -t anasselbaz/jira-clone-java:1.0.0 ."
  }
}

def dockerCmd(args) {
  def dockerHome = tool name: 'docker', type: 'org.jenkinsci.plugins.docker.commons.tools.DockerTool'
    sh "sudo ${dockerHome}/bin/docker ${args}"
}

