import java.text.SimpleDateFormat

def call(){
    def date = new Date()
    sdf = new SimpleDateFormat("MM/dd/yyyy")
    return sdf.format(date)
}
