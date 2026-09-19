def buildApp(){
    echo "Building the application..."
    echo "building ${params.ENV}"
}

def testApp(){
    echo "Running tests..."
}
def deployApp(){
    echo "Deploying the application..."
    echo "version ${params.Version}"
    echo "env ${params.ENV}"
}

return this
