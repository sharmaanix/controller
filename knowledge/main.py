from util.accessApi import FloodlightApi
from util.readWrite import write


api = FloodlightApi('192.168.56.100')



path = '/wm/core/controller/switches/json'
data = api.get("", path)
write(data, "switches")

path = '/wm/core/controller/summary/json'
data = api.get("", path)
write(data, "summary")

path = '/wm/core/module/all/json'
data = api.get("", path)
write(data, "all")

