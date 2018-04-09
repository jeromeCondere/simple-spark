import org.apache.spark.sql.SparkSession

object SimpleSpark {
  def main(args: Array[String]) {
    val csvFile = "YOUR_SPARK_HOME/README.md" // Should be some file on your system

    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()

    spark.stop()
  }
}