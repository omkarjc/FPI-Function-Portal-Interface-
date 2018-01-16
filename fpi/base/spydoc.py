def fpi(data):

			import subprocess
			file = open("base/intermidiate.txt","w")
			file.write(data)
			file.close()
			proc = subprocess.Popen("php base/core.php", shell=True, stdout=subprocess.PIPE)
			script_response = proc.stdout.read()
			file = open("base/intermidiate.txt","r")
			result = file.read()
			file.close()
			return(result)


