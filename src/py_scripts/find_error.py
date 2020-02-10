# Author: Ramon Capunpon
# finding words in files and moving them in a different directory.
# this file is used for error finding but can be modified for generic use
#!/usr/bin/env python3
import mmap, os, sys
def find_error(input_dir, output_dir, word):
    for filename in os.listdir(input_dir): 
        with open(input_dir + filename, 'rb', 0) as file, \
            mmap.mmap(file.fileno(), 0, access=mmap.ACCESS_READ) as s:
            if s.find(word.encode()) != -1:
                file.close()
                s.close()
                os.rename(input_dir + filename, output_dir + "w_error_" + filename) 
        
if __name__ == "__main__":
	if len(sys.argv) < 4 or len(sys.argv) > 4:
		print("Usage is find_error.py input_directory output_directory word_to_search")
		sys.exit("Invalid argument length.");
	find_error(sys.argv[1], sys.argv[2], sys.argv[3])