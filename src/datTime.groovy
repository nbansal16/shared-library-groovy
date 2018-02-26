import java.text.SimpleDateFormat

def call(){
    def date = new Date()
    sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
    return sdf.format(date)
}
