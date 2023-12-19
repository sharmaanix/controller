from loguru import logger
from util.accessApi import FloodlightApi
from util.readWrite import write


api = FloodlightApi('192.168.1.35')
logger.info("Initialized API")

logger.info("Retrieved Switch Data")
path = '/wm/core/controller/switches/json'
data = api.get("", path)
logger.error(data)
# write(data, "switches")

# path = '/wm/core/controller/summary/json'
# data = api.get("", path)
# write(data, "summary")

# path = '/wm/core/module/all/json'
# data = api.get("", path)
# write(data, "all")

