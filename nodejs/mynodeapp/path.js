import path from 'path'
const filepath="d:/nodeapps/myfile.txt"
var filename=path.basename(filepath)
console.log(filename)
console.log(path.delimiter)
console.log(path.dirname(filepath))
console.log(path.extname(filepath))
console.log(path.isAbsolute(filepath))