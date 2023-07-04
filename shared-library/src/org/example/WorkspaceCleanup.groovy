package org.example

def call() {
  // Get the current build
  def currentBuild = Jenkins.instance.getItemByFullName(env.JOB_NAME).getBuildByNumber(env.BUILD_NUMBER)

  // Get the workspace path
  def workspace = currentBuild.getWorkspace().getRemote()

  // Clean up the workspace
  cleanWorkspace(workspace)
}

def cleanWorkspace(String workspace) {
  // Delete all files and directories in the workspace
  sh "rm -rf ${workspace}/*"

  // Optional: Delete hidden files and directories in the workspace
  // sh "rm -rf ${workspace}/.*"
}