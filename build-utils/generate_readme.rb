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

  ## generate read
  README_TEMPLATE = 'README.erb'
  README_DESTINATION = 'README'

  template_source =  File.dirname(__FILE__) + '/' + README_TEMPLATE
  target_path = File.dirname(__FILE__)  + '/../' + README_DESTINATION

  File.open(target_path, 'w') do |file|
   file.write QuickTemplate.new(template_source).exec()
  end

   ## run git commit with comment
   `"git commit -am '#{ARGV[1]}'"`
end