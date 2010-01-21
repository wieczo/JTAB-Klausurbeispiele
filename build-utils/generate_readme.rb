#!/usr/bin/ruby
require 'erb'
# from http://snippets.dzone.com/posts/show/1723
class QuickTemplate
   attr_reader :text
   
   def initialize(file)
		puts file
      @text = File.read(file)
   end
   
   def exec()
      b = binding
      template = ERB.new(@text)
      result = template.result(b)
      # Chomp the trailing newline
      result.gsub(/\n$/,'')
   end
end


if __FILE__ == $0
	README_TEMPLATE = 'README.erb'
  README_DESTINATION = 'README'
	#parentDirectory = Dir.getWd +'/../'
	
  template_source =  Dir.getwd + '/' + README_TEMPLATE
  target_path = Dir.getwd + '/../' + README_DESTINATION
	
  File.open(target_path, 'w') do |file|
    file.write QuickTemplate.new(template_source).exec()
  end
	
end