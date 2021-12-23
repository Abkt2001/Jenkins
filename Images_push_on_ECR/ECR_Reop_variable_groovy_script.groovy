
def command = "aws ecr describe-repositories --query repositories[].[repositoryName]  --region $awsregion --output text "
def proc = command.execute()
def result = proc.text.tokenize()
return result

