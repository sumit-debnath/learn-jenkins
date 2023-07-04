package com.example

class WorkspaceCleanup {
    static void cleanup() {
        def ws = Jenkins.instance.getWorkspace(currentBuild.rawBuild.getProject())
        ws.deleteRecursive()
        ws.mkdirs()
        echo "Workspace cleaned up."
    }
}
