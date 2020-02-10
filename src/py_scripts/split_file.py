# Author: Ramon Capunpon
# splitting a large file by line count
#!/usr/bin/env python3
import os, sys
 
def split_file(in_file, out_dir, line_size):
	if not os.path.isdir(out_dir):
		sys.exit("Cant access the directory {}.".format(out_dir));
	
	count = 
	lines_written = 0 
	out_file = "{}/split{}.txt".format(out_dir, str(count))
 
	with open(input_file, 'rb') as f:
        for line in f:
			if lines_written == line_size:
				lines_written = 0
				count += 1
				out_file = "{}/split{}.txt".format(out_dir, str(count))
			with open(out_file, 'a') as o_file:
    			o_file.write(line)
			
			lines_written += 1
 
if __name__ == "__main__":
	if len(sys.argv) < 4 or len(sys.argv) > 4:
		print("Usage is script.py input_path output_directory line_count")
		sys.exit("Invalid argument length.");
	split_file(sys.argv[1], sys.argv[2], int(sys.argv[3]))