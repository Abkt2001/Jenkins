
def command = "aws ec2 describe-instances --query Reservations[*].Instances[*].{Name:Tags[?Key=='Name']|[0].Value} --region $awsregion --output text "
def proc = command.execute()
def result = proc.text.tokenize()
return result
