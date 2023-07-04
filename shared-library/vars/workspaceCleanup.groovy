def call() {
    def ws = currentBuild.getWorkspace()
    ws.deleteRecursive()
    ws.mkdirs()
    echo "Workspace cleaned up."
}
