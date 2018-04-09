import org.apache.spark.sql.SparkSession

object SimpleSpark {
  def main(args: Array[String]) {
  	val csvFile = "abcnews-date-text.csv" // Should be some file on your system
    val spark = SparkSession.builder.appName("Simple Spark Application").getOrCreate()

    spark.stop()
  }
}