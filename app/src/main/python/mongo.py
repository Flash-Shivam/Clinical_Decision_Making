import pymongo
import dns.resolver
dns.resolver.default_resolver=dns.resolver.Resolver(configure=False)
dns.resolver.default_resolver.nameservers=['8.8.8.8']
def main(arg1,arg2,arg3,arg4,arg5,arg6):
    myclient = pymongo.MongoClient("mongodb://Shivam:WUMKLcLM@cluster0-shard-00-00.rq8ip.mongodb.net:27017,cluster0-shard-00-01.rq8ip.mongodb.net:27017,cluster0-shard-00-02.rq8ip.mongodb.net:27017/myFirstDatabase?ssl=true&replicaSet=atlas-bvn7lt-shard-0&authSource=admin&retryWrites=true&w=majority")

    mydb = myclient["Dental"]

    mycol = mydb["patients"]

    mydict = {'Emergency phase': arg1 , 'Phase I' : arg2, 'Phase II':arg3 ,'Phase III' :arg4 , 'Phase IV':arg5 ,'Phase V':arg6}

    z = mycol.insert_one(mydict)

    return z
