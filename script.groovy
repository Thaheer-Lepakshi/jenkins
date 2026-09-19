def buildApp(){
    echo "Building the application..."
    echo "building ${params.ENV}"
}

def testApp(){
    echo "Running tests..."
}
def deployApp(env1, version1) {
    echo "Deploying the application..."
    echo "version ${version1}"
    echo "env ${env1}"
}

return this
