open("foo.txt", "r+") as f:
     old = f.read() # read everything in the file
     f.seek(0) # rewind
     f.write("new line\n" + old) # write the new line before