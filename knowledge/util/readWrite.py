import csv
import json
import os
import sys

sys.path.append('..')

def write(data, name):
    
    file_path = "data/"+name+".csv"


    file_exists =  (os.path.exists(file_path) and ( os.stat(file_path).st_size != 0))

    #print(file_exists)

    with open(file_path, "a") as data_file:


        if type(data) is list:

            field_name_list = data[0].keys()
        
            writer = csv.DictWriter(data_file, fieldnames=field_name_list)

            if(not file_exists):
                writer.writeheader()

            for row in data:
                # Writing data of CSV file
                writer.writerow(row)

        else:

            writer = csv.DictWriter(data_file, fieldnames=data.keys())

            if(not file_exists):
                writer.writeheader()

            writer.writerow(data)

       
