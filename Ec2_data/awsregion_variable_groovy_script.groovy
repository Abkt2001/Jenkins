def command = "aws ec2 describe-regions --all-regions --query Regions[].{Name:RegionName} --output text"
def proc = command.execute()
def result = proc.text.tokenize()
return result
